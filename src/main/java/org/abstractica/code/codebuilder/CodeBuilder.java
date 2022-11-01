package org.abstractica.code.codebuilder;

import org.abstractica.code.codebuilder.blockbuilder.BlockBuilder;
import org.abstractica.code.codebuilder.textoutput.IndentedTextOutput;
import org.abstractica.code.codebuilder.listbuilder.ListBuilder;

public interface CodeBuilder extends IndentedTextOutput
{
	ListBuilder list();
	BlockBuilder block();
}
