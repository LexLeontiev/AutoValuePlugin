package com.afcastano.intellij.autovalue.actions;

import com.afcastano.intellij.autovalue.constants.ActionType;
import com.afcastano.intellij.autovalue.generator.AutoValueHandlerFactory;
import com.intellij.codeInsight.generation.actions.BaseGenerateAction;

//TODO eventually remove the right click action.
public class GenerateAutoValueBuilderAction extends BaseGenerateAction {

    public GenerateAutoValueBuilderAction() {
        super(AutoValueHandlerFactory.make(ActionType.GENERATE_BUILDER));
    }

}
