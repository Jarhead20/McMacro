package com.mcmacro.core;

public class ActionParamParser {
    public ActionParamParser(String scriptl) {
    }

    public String[] getParams(String action) {
        String paramlist = action.substring(action.indexOf("(") + 1);
        String[] params = paramlist.replace(");","").split(",");
        return params;
    }
    public String paramString(String action) {
        String paramlist = action.substring(action.indexOf("(") + 1);
        String params = paramlist.replace(");","");
        return params;
    }
}
