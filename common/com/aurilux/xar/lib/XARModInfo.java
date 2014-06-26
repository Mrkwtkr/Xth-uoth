package com.aurilux.xar.lib;

public class XARModInfo {
	public static final String MOD_ID       = "xthuoth";
	public static final String MOD_NAME     = "Xth'uoth";
	public static final String MOD_TITLE    = MOD_NAME + ": The Aberrant Realm";
	public static final String MOD_VERSION  = "@MOD_VERSION@";//"0.1.6";
    public static final String MOD_DEPEND   = "required-after:Thaumcraft";
	
	public static final String ASSETS_DIR   = "assets/" + MOD_ID + "/";
	
	public static final String VERSION_FILE = "https://raw.githubusercontent.com/Aurilux/Xth-uoth/master/version.xml";
	
	public static final String CLIENT_PROXY = "com.aurilux.xar.proxy.ClientXARProxy";
	public static final String SERVER_PROXY = "com.aurilux.xar.proxy.CommonXARProxy";
}