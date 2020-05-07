package com.example.java8;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author alan.wu
 * @ClassName: Constant
 * @Description: 常量类
 * @date 2017年6月21日
 */
public class Constant {
    //用户登录信息
    public final static String LOGIN_REQ_ATTR_KEY = "LOGIN_REQ_ATTR_KEY";

    public final static String ZERO = "0";

    public final static String SUCCESS = "0";
    public final static String SUCCESS1 = "1";
    public final static String SUCCESS2 = "OK";
    public static final String CCX_V_SUCCESS = "2060";
    public static final String CCX_SUCCESS = "0000";
    public final static String FAIL = "-1";
    public final static String FAIL1 = "1";
    public final static String FAIL2 = "90099";
    public final static int SUCCESS_INT = 0;
    public final static String Y = "Y";
    public final static String N = "N";

    public final static String APPKEY = "appKey";
    public final static String APPSECRET = "appSecret";

    public final static String CONTENT_TYPE_JSON = "application/json";

    public final static String CHANNEL_ZX = "zx";

    public final static int HTTP_400 = 400;
    public final static int HTTP_401 = 401;
    public final static int HTTP_404 = 404;
    public final static int HTTP_555 = 555;
    public final static int HTTP_403 = 403;
    public final static int HTTP_500 = 500;
    public final static int HTTP_413 = 413;

    public final static String MSG_SUCCESS = "信息一致";
    public final static String MSG_FAIL = "信息不一致";
    public final static String FACE_SUCCESS = "检测成功";

    public final static String ID = "id";
    public final static String BANK = "bank";
    public final static String PHONE = "phone";
    public final static String ID_OCR = "id_ocr";
    public final static String BANK_OCR = "bank_ocr";
    public final static String ID_FRONT_BACK_OCR = "id_front_back_ocr";
    public final static String FACE = "face";
    public final static String FACE_VERIFY = "face_verify";
    public final static String FACE_LIVENESS = "face_liveness";
    public static final String PHONE_NAME = "phone_name";
    public final static String MOBILE_NETWORK_STATUS = "phone_status";
    public final static String MOBILE_NETWORK_TIME = "phone_time";
    public static final String PHONE_CITY_CHECK = "phone_city_check";
    public static final String CARDHIS = "card_his";
    public static final String SUITINFO = "suit_info";
    public static final String HIT_LIST = "hit_list";
    public static final String MULTI_LOAN = "multi_loan";
    public static final String OVERDUE = "overdue";
    public static final String PHONE_MARK = "phone_mark";
    public static final String PHONE_MARK_NET = "phone_mark_net";
    public static final String MULTI_LOAN_ALL = "multi_loan_all";
    public static final String TOTAL_DEBT = "total_debt";
    public static final String IP = "ip";
    public static final String PHONE_ADDRESS = "phone_address";
    public static final String MULTI_LOAN_BAIDU = "multi_loan_baidu";
    public static final String BLACK_INDUSTRY_BAIDU = "black_industry_baidu";
    public static final String RISK_LIST_BAIDU = "risk_list_baidu";

    public static final String VIDEO_VALIDATE = "video_validate";  // 视频上传与基本检测
    public static final String RANDOMNUM = "random_number";
    public static final String VIDEO_VERIFY = "video_verify";  //活体检测
    public static final String FACE_COMPARE = "face_compare";  //APP 面部对比
    public final static String SENSETIME_LIVENESS = "sensetime_liveness";
    public final static String KEEP_CARD_COMPARE = "keep_card_compare";


    public final static String BANKCARD = "bankCard";
    public final static String IDCARD = "idCard";
    public final static String OCR = "ocr";

    public final static String SORT_ASC = "asc";
    public final static String SORT_DESC = "desc";

    public final static int HTTP_TIMEOUT_CONNECT = 5000;
    public final static int HTTP_TIMEOUT_READ = 10000;
    public final static int HTTP_TIMEOUT_CONNECT_LONG = 5000;
    public final static int HTTP_TIMEOUT_READ_LONG = 30000;
    public final static long MSG_HOURS = 6;
    public final static long CREDIT_DAY = 7;

    public final static String AESKEY = "20150310";

    public final static String TWO_ELEMENTS = "two Elements";
    public final static String THREE_ELEMENTS = "three Elements";
    public final static String FOUR_ELEMENTS = "four Elements";

    public final static String DAY = "day";
    public final static String DAY7 = "day7";//最近7天
    public final static String DAY30 = "day30";//最近30天

    public final static String MAXFILESIZE = "20480KB";//20MB
    public final static String MAXREQUESTSIZE = "102400KB";//100MB

    public static final int NUM_WARNING = 5;//预警人员数量上限

    public static final String INQUIRY_CHARGE = "inquiry_charge"; //查询收费
    public static final String RESULT_CHARGE = "result_charge"; //查得收费

    public static Map<String, String> GEOTOKENMAP = new HashMap<>();
    public static Map<String, String> RUISAITOKENMAP = new HashMap<>();
    public static Map<String, String> BAIDUTOKENMAP = new HashMap<>();

    public static final String COMPANY_LIST = "companyList";
    public static final String CONFIG_LIST = "configList";
    public static final String CHANNEL_LIST = "channelList";


    public static List<String> FILTER_URI = BeanUtils.createList("/credit/face", "/credit/ocr", "/credit/idOcr", "/credit/keepCardCompare");
    public static List<String> FEE_COMPANY = BeanUtils.createList("tiger", "gww");

}
