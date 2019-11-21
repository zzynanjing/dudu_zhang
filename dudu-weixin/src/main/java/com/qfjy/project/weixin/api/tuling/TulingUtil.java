package com.qfjy.project.weixin.api.tuling;

import com.qfjy.project.weixin.api.tuling.bean.InputText;
import com.qfjy.project.weixin.api.tuling.bean.Perception;
import com.qfjy.project.weixin.api.tuling.bean.TuLingBean;
import com.qfjy.project.weixin.api.tuling.bean.UserInfo;
import com.qfjy.project.weixin.util.WeixinUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class TulingUtil {

    private static final String TULING_API_URL="http://openapi.tuling123.com/openapi/api/v2";

    public String sendMessage(String msg){
        //生成JSON对象
        JSONObject jsonObject = sendJSONObject(msg,"17d52031ee2646d3a7ce71c7ad0dd186");
        //对指定的API地址发送post请求（传入入参JSON对象）
        JSONObject object= WeixinUtil.httpRequest(TULING_API_URL,"POST",jsonObject.toString());

        System.out.println("响应的消息:"+object.toString());
        JSONArray array= (JSONArray) object.get("results");

        JSONObject object1= (JSONObject) array.get(0);
        JSONObject object2= (JSONObject) object1.get("values");
        String result= (String) object2.get("text");
        return result;
    }



    public JSONObject sendJSONObject(String msg,String apikey){
        InputText inputText = new InputText();
        inputText.setText(msg);
        Perception perception = new Perception();
        perception.setInputText(inputText);

        UserInfo userInfo = new UserInfo();
        userInfo.setApikey(apikey);
        userInfo.setUserId("java1903");

        TuLingBean tuLingBean = new TuLingBean();
        tuLingBean.setPerception(perception);
        tuLingBean.setUserInfo(userInfo);

        JSONObject jsonObject = JSONObject.fromObject(tuLingBean);
        return jsonObject;
    }

}
