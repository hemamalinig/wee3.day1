package org.system;
/* Assignment1
===========
     Package   :org.system
     Class        :Computer
     Methods   :computerModel()

     Class        :Desktop
     Methods   :desktopSize()

Description:
create above 2 class and call all your class methods into the Desktop using single inheritance.*/

public class Desktop extends Computer {
	public void desktopSize()
	{
		System.out.println("desktopSize class");
	}
	public static void main(String[] args) {
//	Computer comp = new Computer();
//	comp.computerModel();
	Desktop ds = new Desktop();
	ds.computerModel();
	ds.desktopSize();	
	}
}
