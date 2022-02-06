package com.gwc.demo.learn.dingTalk;


import java.net.URL;

public class DingDingMessageUtil {
    public static String access_token = "d9b3eff49212b8550f3f0811cb0778d25cca64b739a09fb6a7b40adb7a4a01eb";
    public static void sendTextMessage(String msg,String author,String projectName) {
        try {
            Message message = new Message();
            message.setMsgtype("text");
//            message.setText(new MessageInfo("项目名："+projectName+"\n负责人@"+author+"\n"+msg+"测试"));
            URL url = new URL("https://oapi.dingtalk.com/robot/send?access_token=" + access_token);
//            // 建立 http 连接
//            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//            conn.setDoOutput(true);
//            conn.setDoInput(true);
//            conn.setUseCaches(false);
//            conn.setRequestMethod("POST");
//            conn.setRequestProperty("Charset", "UTF-8");
//            conn.setRequestProperty("Content-Type", "application/Json; charset=UTF-8");
//            conn.connect();
//            OutputStream out = conn.getOutputStream();
//            String textMessage = JSONObject.toJSONString(message);
//            byte[] data = textMessage.getBytes();
//            out.write(data);
//            out.flush();
//            out.close();
//            InputStream in = conn.getInputStream();
//            byte[] data1 = new byte[in.available()];
//            in.read(data1);
//            System.out.println(new String(data1));
//            ClientHttpRequest clientHttpRequest = factory.createRequest(url.toURI(), HttpMethod.POST);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Message {
    private String msgtype;
    private MessageInfo text;
    public String getMsgtype() {
        return msgtype;
    }
    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }
    public MessageInfo getText() {
        return text;
    }
//    public void setText(MessageInfo text) {
//        this.text = text;
//    }
}

class MessageInfo {
    private String content;
    public MessageInfo(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}
