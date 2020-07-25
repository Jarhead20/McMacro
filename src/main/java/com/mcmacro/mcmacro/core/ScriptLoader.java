package com.McMacro.core;


public class ScriptLoader {
    public String script;
    public ScriptLoader(String script) {
        this.script = script;
    }
    public String[] setScript() {
        try {
            com.McMacro.core.ScriptParser parser = new com.McMacro.core.ScriptParser(script, false);
            String[] actions = parser.getActions();
            return actions;
        } catch (Exception e) {

        }
        return null;
    }
}
