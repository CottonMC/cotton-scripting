package io.github.cottonmc.cotton_scripting;

import io.github.cottonmc.cotton_scripting.api.ScriptApiObject;
import net.minecraft.util.Identifier;

import javax.script.Bindings;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.Optional;

public interface ScriptParser {

    /**
     * Returns an Invocable from the engine that can be used to execute the script's `main` method.
     * This is a decision made to make repeated execution faster, as we only compile once.
     *
     * @param script the source of the script
     * @return an optional that may contain something that can be executed.
     *
     * */
    Optional<ExecutableScript> parse(String script);

    /**
     * returns true if this identifier (with file extension) is valid for this engine.
     * makes sure that you don't put python code into nashorn.
     * */
    boolean canParse(Identifier scriptID);

}
