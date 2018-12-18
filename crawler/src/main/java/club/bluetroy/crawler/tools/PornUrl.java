package club.bluetroy.crawler.tools;

import club.bluetroy.crawler.dao.entity.Category;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: heyixin
 * Date: 2018-11-30
 * Time: 18:16
 */
public class PornUrl {
    private static String host = "http://91porn.com";

    public static String getHost() {
        return host;
    }

    public static void setHost(String host) {
        PornUrl.host = host;
    }

    public static String getUrl(Category category) {
        return host + "/v.php" + getCategoryQueryParam(category);
    }

    private static String getCategoryQueryParam(Category category) {
        return "?category=" + category.getCategory();
    }

    public static String getLoginUrl() {
        return host + "/login.php";
    }

    public static String getLoginParams(String name, String password, String verificationCode) {
        return "action_login=Log+In&captcha_input=" + verificationCode + "&fingerprint=&fingerprint2=&password=" + password + "&username=" + name + "&x=40&y=6";
    }
}