package com.mcmacro.core;


public class ScriptLoader {
    public String script;
    public ScriptLoader(String script) {
        this.script = script;
    }
    public String[] setScript() {
        try {
            ScriptParser parser = new ScriptParser(script, false);
            String[] actions = parser.getActions();
            return actions;
        } catch (Exception e) {

        }
        return null;
    }
}
