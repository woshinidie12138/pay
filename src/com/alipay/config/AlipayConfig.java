package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2021000117607590";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC3h5TfmOawR6JinoBXDoxXxPOj9ijbNYDf6lrYXM2t+XY6JCp3NYsS3vi8/nkd1Rsq65//VHZTAvecrA4SU65An5MNVMShFyLvh7u1krdU9dn/w5UmPKscT8bz9jTzEy03Lsi/Foj+1FGuQipSFIPH3ulkhRp4tsTWi5FGCr2IYP92Ka4H2iKM9ezvtIN962LXmNtjJd4m5Rd8b7HWsCXIMLaTDOHITqzSzLUjmGGRkOn7FMmMfPrw1xI2RoHgxXXEwToQgC0vdy32y7xwwM0PtCCHXZi91aFvtsQ/LUYPMh9HUuwHp0Mw+4WgHvDjDfM0Cf7/iuKxPwLW93IxjEHFAgMBAAECggEAZLgVbXg98bP+W9zcVep3/prpkqu+1D5SkY/NdzvG7Jkg1tuOKonJ3vtaym1lDogrNqzEy50QqpHQTbzmpAwkbvaj/wbsOfO2inmU/BqeXhPmJUSyj59v0EO/zZbqjBOUFtqn9KZrXF4szVMmYpE7mO6uaynY0zKKZ6uEeEngpfyUTUhwwurdSK43rX7JvVKJ+EnzWmGStiav+oQgNhV6OA4E1GsEy+oONlNPxzwcPsXZIJcEdSxcPnkO8P/KpAfSbgvFi1mfseMoUtbEoOFqblIvIWxqNKq7d+73c2HkoJ+F8rRaaiTjvKVdSj6sy5hjr9o15Ocn94AQ8nDm4zM1aQKBgQD/pav8BNC9V8olAKHCc6LwKtGA98/CuUzH5Ee5xN8H0wd5I5FS5CuPQnSkC07C7bGXiZAaRnZp74poGQAP6a/HmLCSbt1+y3IY6GtgTKKcd6ZBG6D7ExG4lj3ULBDAwzwQCveJUxLvZZQ0DWooFH1Y0qcsVpQcrF8hz4QwN5BQiwKBgQC3yG2mxS91yABRI6gQLOqY5ExjV7otFRFQK2FyjUGtIQxHQUZWK2xfDzc1ymBmhE+rrweS/GSY3xib3TH6EtrtLh0SO/wH82U6e1QUDd4FNJ0aCClZvbEpBOb/hJMIVRXNDXLETTR3Fou740fCoG7QDBKJGK2RSRPOu4+bEAUw7wKBgBorppiNEaVgeFQjZWvXlKWLbJkMRVuExqRr7R/KVJ6jbs9q4bSfoQnwXqpwceaomJaPwY2/Ct47ZGrVrFj0rkb7jY/gA5K4VvzPxjY8giUMZpuhrXAmepjv4HJ49FoXYm2uAbswIu8Y8fwGJ4jk2BQgtHZogo8Q4kg+yyR4e7CTAoGBALLBP+X15TOqVKSXCeCxz3zmkWYO7gbrduuDRkUlH7xFaKvl0YP+uGm9YvXu4dTU3KkglT1iQHZwiH8RpoqVzFrlf2E89ubE1rELQ7w9wLVPd37acV3YI3jCS+w8BscT+yB29Cn67gzm4QLfDe1AHog9NcojNq8ZZSqvQ/6Oln4BAoGAYvHrqKy0TjU0OE7lKBcs+1delWAkvPjx2abGKQ2XVu2J2KVytrsyqJ91vqObt43pB967GrlF+z2sMxtyAP5KHDu62dSo5q8CqjPK4wORdfA4iN3nHSnEUWlzAOz0aBqCj2GgOQW7rVNONIDfdXNn1C56kof1l8QkhX9fhsWzRq0=";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAm2QE98CwNHyJnEE/VHgNM5JFwn/v5kxgGbdr+Mx/Owvt7mFNvyvIhEyxPvCJiShEdgSt+Ax1jGKy2I2YxKXcTTA20EwC+T9r4muq4JTxo0OhubuvCuWns4HyZVOv99G1AsUzwEv4sxu2guOK74JEoUqQVcOvjKclX+UGrrVHIZW0ZaV0L8VLMjU8+iMjn32zJjG+CEqfSYUSl44aJcugaHYxCyjOyx2OlNr02t04CQ5k6X2I6h4tdG4rKe+cZsLS9UZKtYNuUz8oTFINTIhOU1q+/ezMqHZkiCxhB7sWMsrl+Mth+P8jFtAu8Hk5R7uzBJBFdiDQcXS+0Rh8N6kCSQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://mpsbd9.natappfree.cc/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://mpsbd9.natappfree.cc/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

