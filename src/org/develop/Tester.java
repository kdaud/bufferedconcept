package org.develop;

public class Tester {
	
	public void mycode(Subject s) {
		if (s instanceof Project2) {
			Project2 pp =(Project2)s;
			pp.projectMethod();
		}
		if (s instanceof OperatingSystems) {
			
			OperatingSystems os = (OperatingSystems) s;
			os.myOS();
		}
		if (s instanceof LinuxAdvanced) {
			LinuxAdvanced ll = (LinuxAdvanced) s;
			ll.linuxMethod();
		}
	}
	
}
