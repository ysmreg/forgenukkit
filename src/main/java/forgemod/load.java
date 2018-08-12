package forgemod;

import io.github.classgraph.ClassGraph;
import io.github.classgraph.ScanResult;

public class load {
	public load() {
	try(ScanResult sr=new ClassGraph().verbose().enableAllInfo().scan()){
		ClassInfoList lis=sr.getClassesWithAnnotation();
	}
	}
}
