package com.McMacro.core;

public class ScriptParser {
    String script;
    boolean cloud;
    String[] actions;

    public ScriptParser(String script, boolean cloud)  {
        this.script = script;
        this.cloud = cloud;
        this.actions = script.split(";");
    }



    public String getActionName(String extract)  {
        int pos = extract.indexOf("(");
        if (pos != -1) {
            return extract.substring(0, pos);
        }
        return null;
    }

    public int getOpenedParentheses()  {
        int para = 0;
        for (int i = 0; i < actions.length; i++) {
            if (actions[i].contains("{")) {
                para++;
            }
        }
        return para;
    }

    public int getClosedParentheses() {
        int para = 0;
        for (int i = 0; i < actions.length; i++) {
            if (actions[i].contains("}")) {
                para++;
            }
        }
        return para;
    }

    public String[] getActions() {
        try {
            String[] actionname = null;
            for (int i = 0; i < actions.length; i++) {
                actionname[i] = getActionName(actions[i]);
            }
            return actionname;
            } catch (Exception e) {
        }
        return null;
        }
}
