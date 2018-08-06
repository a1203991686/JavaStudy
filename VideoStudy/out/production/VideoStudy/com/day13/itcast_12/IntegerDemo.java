// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   IntegerDemo.java

package com.day13.itcast_12;

import java.io.PrintStream;

public class IntegerDemo
{

	public IntegerDemo()
	{
	}

	public static void main(String args[])
	{
		System.out.println(Integer.toBinaryString(100));
		System.out.println(Integer.toOctalString(100));
		System.out.println(Integer.toHexString(100));
		System.out.println("--------------");
		System.out.println(Integer.toString(100, 10));
		System.out.println(Integer.toString(100, 2));
		System.out.println(Integer.toString(100, 8));
		System.out.println(Integer.toString(100, 10));
		System.out.println(Integer.toString(100, 5));
		System.out.println(Integer.toString(100, 7));
		System.out.println(Integer.toString(100, -7));
		System.out.println(Integer.toString(100, 70));
		System.out.println(Integer.toString(100, 1));
		System.out.println(Integer.toString(100, 17));
		System.out.println(Integer.toString(100, 32));
		System.out.println(Integer.toString(100, 37));
		System.out.println(Integer.toString(100, 36));
		System.out.println("--------------");
		System.out.println(Integer.parseInt("100", 10));
		System.out.println(Integer.parseInt("100", 2));
		System.out.println(Integer.parseInt("100", 8));
		System.out.println(Integer.parseInt("100", 16));
		System.out.println(Integer.parseInt("4f", 16));
		System.out.println(Integer.parseInt("123", 2));
	}
}
