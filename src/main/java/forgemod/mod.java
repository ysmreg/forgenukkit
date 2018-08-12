package forgemod;

import java.io.File;
import java.io.FilenameFilter;
import java.net.MalformedURLException;

import jarclass.loader;

public class mod {
public void init() {
	//modsフォルダ内のjarファイル一覧取得
	FilenameFilter filter = new FilenameFilter() {
		
		public boolean accept(File file, String str){
							
			// 拡張子を指定する				
			if (str.endsWith("zip")||str.endsWith("jar")){
				return true;
			}else{
				return false;
			}
		}
	};
	
	//"jar,zip"が含まれるフィルタを作成する
	File[] files = new File("mods").listFiles(filter);
	//クラスローダー取得
	ClassLoader cl=getClass().getClassLoader();
	//jarファイル読み込みと実行
	for(int i=0;files.length>i;i++) {
	try {
		ClassLoader classLoader = new loader(files[i], cl);
	} catch (MalformedURLException e) {
		// TODO 自動生成された catch ブロック
		e.printStackTrace();
	}
	}
}
}
