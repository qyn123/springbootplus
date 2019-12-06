package ${basePackageController};
import ${basePackage}.core.response.OutDTO;
import ${basePackage}.core.response.ResponseHandler;
import ${basePackageModel}.${modelNameUpperCamel};
import ${basePackageService}.${modelNameUpperCamel}Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.*;
import java.net.URLEncoder;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import javax.annotation.Resource;
import java.util.List;

/**
* @Description: ${modelNameUpperCamel}Controller类
* @author ${author}
* @date ${date}
*/
@RestController
@RequestMapping("/${baseRequestMapping}")
@Api(tags = "${modelNameUpperCamel}Controller控制处理器", description = "包含：\n" +
		"1、${modelNameUpperCamel}新增\n" +
		"2、${modelNameUpperCamel}删除\n" +
		"3、${modelNameUpperCamel}修改\n" +
		"4、${modelNameUpperCamel}按主键查询\n" +
		"5、${modelNameUpperCamel}列表查询\n" +
        "6、${modelNameUpperCamel}列表导出\n"   +
        "7、${modelNameUpperCamel}批量导入"
)
public class ${modelNameUpperCamel}Controller {

    @Resource
    private ${modelNameUpperCamel}Service ${modelNameLowerCamel}Service;

    @ApiOperation(value = "${modelNameUpperCamel}新增",
            notes = "请求样例：\n POST /insert",
            httpMethod = "POST",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE
     )
    @PostMapping("/insert")
    public OutDTO<Integer> insert(@RequestBody ${modelNameUpperCamel} ${modelNameLowerCamel}) throws Exception{
    	Integer state = ${modelNameLowerCamel}Service.insert(${modelNameLowerCamel});
        return ResponseHandler.makeOkResp(state);
    }

    @ApiOperation(value = "${modelNameUpperCamel}删除",
        notes = "请求样例：\n POST /deleteById",
        httpMethod = "POST",
        produces = MediaType.APPLICATION_JSON_UTF8_VALUE
        )
    @PostMapping("/deleteById")
    public OutDTO<Integer> deleteById(String id) throws Exception {
        Integer state = ${modelNameLowerCamel}Service.deleteById(id);
        return ResponseHandler.makeOkResp(state);
    }

     @ApiOperation(value = "${modelNameUpperCamel}修改",
        notes = "请求样例：\n POST /update",
        httpMethod = "POST",
        produces = MediaType.APPLICATION_JSON_UTF8_VALUE
        )
    @PostMapping("/update")
    public OutDTO<Integer> update(@RequestBody ${modelNameUpperCamel} ${modelNameLowerCamel}) throws Exception {
        Integer state = ${modelNameLowerCamel}Service.update(${modelNameLowerCamel});
        return ResponseHandler.makeOkResp(state);
    }

     @ApiOperation(value = "${modelNameUpperCamel}按主键查询",
            notes = "请求样例：\n POST /selectById",
            httpMethod = "POST",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE
            )
     @PostMapping("/selectById")
    public OutDTO<${modelNameUpperCamel}> selectById(String id) throws Exception {
        ${modelNameUpperCamel} ${modelNameLowerCamel} = ${modelNameLowerCamel}Service.selectById(id);
        return ResponseHandler.makeOkResp(${modelNameLowerCamel});
    }

    /**
	* @Description: 分页查询
	* @param page 页码
	* @param size 每页条数
	* @Reutrn OutDTO<PageInfo<${modelNameUpperCamel}>>
	*/
     @ApiOperation(value = "${modelNameUpperCamel}列表查询",
            notes = "请求样例：\n POST /list",
            httpMethod = "POST",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE
     )
    @PostMapping("/list")
    public OutDTO<PageInfo<${modelNameUpperCamel}>> list(@RequestParam(defaultValue = "0") Integer page,
					@RequestParam(defaultValue = "0") Integer size) throws Exception {
        PageHelper.startPage(page, size);
        List<${modelNameUpperCamel}> list = ${modelNameLowerCamel}Service.selectAll();
        PageInfo<${modelNameUpperCamel}> pageInfo = new PageInfo<${modelNameUpperCamel}>(list);
        return ResponseHandler.makeOkResp(pageInfo);
    }


    /**
        * @Description: 列表导出
     */
   @ApiOperation(value = "${modelNameUpperCamel}列表导出",
            notes = "请求样例：\n GET /exportExcel",
            httpMethod = "GET",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE
   )
    @GetMapping("/exportExcel")
    private void exportExcel(HttpServletResponse response)throws IOException{
    String fileName="${modelNameUpperCamel}.xls";
    response.setContentType("application/excel");
    response.setHeader("Content-disposition","attachment;filename=" +fileName +";filename*=utf-8''"+ URLEncoder.encode(fileName,"UTF-8"));
    List<${modelNameUpperCamel}> list =  ${modelNameLowerCamel}Service.selectAll();
    HSSFWorkbook workbook=new HSSFWorkbook();
    HSSFSheet sheet=workbook.createSheet();
    int rowNum=0;
    //添加标题
    String[] headers={"标题一","标题二","标题三"};
    HSSFRow row=sheet.createRow(rowNum);
    for (int i =0; i <headers.length;i++){
         HSSFCell cell=row.createCell(i);
         HSSFRichTextString text=new HSSFRichTextString(headers[i]);
         cell.setCellValue(text);
     }
      //添加数据
    for (${modelNameUpperCamel} ${modelNameLowerCamel}List:list) {
          rowNum++;
          HSSFRow row1=sheet.createRow(rowNum);
          row1.createCell(0).setCellValue(${modelNameLowerCamel}List);
          row1.createCell(1).setCellValue(${modelNameLowerCamel}List);
          row1.createCell(2).setCellValue(${modelNameLowerCamel}List);
          }
          workbook.write(response.getOutputStream());
      }


     /**
      * @Description: 批量导入
      * @param path 本地excel文件地址
      */
     @ApiOperation(value = "${modelNameUpperCamel}批量导入",
            notes = "请求样例：\n POST /importExcel",
            httpMethod = "POST",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE
     )
     @PostMapping("/importExcel")
     public void Import(String path) throws IOException{
        File file = new File(path); //实际这个路径由前端传后台
        FileInputStream fis = new FileInputStream(file);
        Workbook wb = null;
        try {
            if(isExcel2003(file.getPath())){
                System.out.println("2003版本Excel: .xls结尾");
                wb = new HSSFWorkbook(fis); //创建2003版本Excel工作簿对象
            }else if (isExcel2007(file.getPath())){
                System.out.println("2007版本Excel: .xlsx结尾");
                wb = new XSSFWorkbook(fis); //创建2007版本Excel工作簿对象
            }else {
                System.out.println("未知版本的Excel !!!");
            }
                Sheet sheet = wb.getSheetAt(0); //获取第1个工作表
                for(int i = 1;i<=sheet.getLastRowNum();i++){//循环Excel文件的i=1行开始
                ${modelNameUpperCamel} ${modelNameLowerCamel} = new ${modelNameUpperCamel}();
                Row row = sheet.getRow(i); //获取第i行
                Cell cell1 = row.getCell(0); //获取第1个单元格的数据
                cell1.setCellType(CellType.STRING); //设置Cell的类型为String类型
                Cell cell2 = row.getCell(1); //获取第2个单元格的数据
                cell2.setCellType(CellType.STRING);
                Cell cell3 = row.getCell(2); //获取第3个单元格的数据
                cell2.setCellType(CellType.STRING);
                ${modelNameLowerCamel}.setxx(cell1.getStringCellValue());
                ${modelNameLowerCamel}.setxx(cell2.getStringCellValue());
                ${modelNameLowerCamel}.setxx(cell3.getStringCellValue());
                System.out.println("第一单元格: " + cell1.getStringCellValue());
                System.out.println("第二单元格: " + cell2.getStringCellValue());
                System.out.println("第三单元格: " + cell3.getStringCellValue());
                ${modelNameLowerCamel}Service.insert(${modelNameLowerCamel}); //保存
            }
          } catch (Exception e) {
            e.printStackTrace();
        }finally {
            fis.close();
     }
 }
     public static boolean isExcel2003(String filePath){
        return filePath.matches("^.+\\.(?i)(xls)$");
     }
     public static boolean isExcel2007(String filePath){
          return filePath.matches("^.+\\.(?i)(xlsx)$");
     }

}