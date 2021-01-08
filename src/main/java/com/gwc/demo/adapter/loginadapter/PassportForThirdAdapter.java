package com.gwc.demo.adapter.loginadapter;

public class PassportForThirdAdapter extends SignService implements IPassportForThird{

    @Override
    public ResultMsg loginForQQ(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForWechat(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return null;
    }

    @Override
    public ResultMsg loginForTelPhone(String telphone, String code) {
        return null;
    }

    @Override
    public ResultMsg loginForRegist(String username, String passport) {
        return null;
    }

    private ResultMsg processLogin(String key,Class<? extends LoginAdapter> clazz){
        try {
            LoginAdapter adapter = clazz.newInstance();
            if (adapter.support(adapter)){
                return adapter.login(key,adapter);
            }else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
