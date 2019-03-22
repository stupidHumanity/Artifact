package artifact;


import artifact.modules.common.util.Excel2PdfUtil;
import artifact.modules.common.util.ExcelUtil;
import artifact.modules.common.util.ExcelUtil.Style;

import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ConsoleTest {

    private static Pattern p = Pattern.compile("\\S+");

    public static void main(String[] args) throws Exception {

        test();
    }

    public static void test() throws Exception {

        URI uri=new URI("https://www.baidu.com/img/bd_logo1.png");
        System.out.println(uri.getPath());


    }
    public static void test6() throws Exception {

        Excel2PdfUtil util = new Excel2PdfUtil();
        String path = "src/main/resources/20190312184124凭证汇总表.xls";
        util.load(path);
        path = "C:\\Users\\DGG-S27-D-20\\Desktop\\凭证汇总表.pdf";
        util.fetch(path);

    }
    public static String test5(int year, int month) throws Exception {

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        month--;
        calendar.set(year, month, 1, 0, 0, 0);
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.SECOND, -1);

        Date date = calendar.getTime();

        return sdf.format(date);

    }

    public static void test4() throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2019-03-18 00:00:00");
        Long localtime = date.getTime();
        if (localtime.equals(1552838400000L)) {
            System.out.println("true");
        }
    }

    public static void test3() throws Exception {
        String path = "C:\\Users\\DGG-S27-D-20\\Desktop\\text1.xls";

        ExcelUtil excelUtil = new ExcelUtil();


        excelUtil.nextSheet(16, 16, 16, 16).nextRow()
                .nextCell("凭证汇总表", 1, 3).nextRow()
                .nextCell("凭证总张数", 2, 2).nextRow()
                .nextCell("1102测试账套", 2, 1).nextCell("2018-06-01 至 2018-06-30", 2, 1).nextRow()
                .fetch(path);

    }

    public static void test2() throws Exception {
        String path = "C:\\Users\\DGG-S27-D-20\\Desktop\\text1.xls";

        ExcelUtil excelUtil = new ExcelUtil();

        Style style_center = excelUtil.createStyle();
        style_center.setHorizontalAlign(Style.ALIGNMENT_CENTER);

        Style style_right = excelUtil.createStyle();
        style_right.setHorizontalAlign(Style.ALIGNMENT_RIGHT);

        Style style_header = excelUtil.createStyle();


        style_header.setHorizontalAlign(Style.ALIGNMENT_CENTER);
        style_header.setBackgroundColor(192, 192, 192);
        style_header.setBorder(Style.BORDER_THIN);
        style_header.setBorderColor(0, 0, 0);


        Style style = excelUtil.createStyle();
        style.setBorder(Style.BORDER_THIN);
        style.setBorderColor(0, 0, 0);


        excelUtil.nextSheet(16, 16, 16, 16).nextRow()
                .setStyle(style_center).nextCell("凭证汇总表", 4, 1).nextRow()
                .setStyle(style_right).nextCell("凭证总张数：12张  附件总张数：11张", 4, 1).nextRow()
                .setStyle(style_right).nextCell("1102测试账套", 2, 1).nextCell("2018-06-01 至 2018-06-30", 2, 1).nextRow()
                .setStyle(style_header).nextCell("科目编码", "科目名称", "借方余额", "贷方余额").nextRow()
                .setStyle(style).nextCell("1001", "kemumingcheng", "1111", "22222")
                .fetch(path);

    }


    public static void test1() {


        String str = "id desc nullLast";

        Matcher matcher = p.matcher(str);
        while (matcher.find()) {

            System.out.println(matcher.group(0));
        }


    }


}
