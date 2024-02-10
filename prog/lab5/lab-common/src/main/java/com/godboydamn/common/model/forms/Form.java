package com.godboydamn.common.model.forms;

import com.godboydamn.common.exceptions.IncorrectInputInScriptException;
import com.godboydamn.common.exceptions.InvalidFormException;

public abstract class Form<T> {
    public abstract T build() throws IncorrectInputInScriptException, InvalidFormException;
}
