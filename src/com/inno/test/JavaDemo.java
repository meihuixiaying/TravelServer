package com.inno.test;

import java.util.Arrays;

public class JavaDemo {
	public static void main(String[] args) {
		String[][] arryStr = new String[3][];
		String[] arg1Str = new String[3];
		String[] arg2Str = new String[2];
		String[] arg3Str = new String[2];
		arg1Str[0] = "name1";
		arg1Str[1] = "name2";
		arg1Str[2] = "name3";
		arg2Str[0] = "name4";
		arg2Str[1] = "name5";
		arg3Str[0] = "name6";
		arg3Str[1] = "name7";
		arryStr[0] = arg1Str;
		arryStr[1] = arg2Str;
		arryStr[2] = arg3Str;
		for (String[] strs : arryStr) {
			System.out.println(Arrays.toString(strs));
		}
	}
}
