// software company wants to maintain bug details reported during application testing. 
// Create a Java class BugTracker and implement the following requirements.
// take given variables differently for each object
//bugId , applicationName, bugtitle, severity, priority, status, assignedDeveloper 
//
//Requirements: -
//Initialize Bug Details - Create an object in main() and assign all initial bug values 
//using the object reference.
// > getBugid() - Return the bug ID.
// > getApplicationName() - Return the application name. 
//
// > getBugTitle() - Return the bug title. 
//
// > getseverity() - Return the bug severity. 
//
// > getPriority() - Return the bug priority. 
//
// > getstatus() - Return the current bug status.   
//
//>getAssignedDeveloper() - Return the assigned developer name.
//
// > assignToDeveloper(int bugid, string developerName) - Asjign the developer 
//to the bug and call updatestatus() to change the status to "In Development".  
// > updateStatus (String newstatus) - Update the current bug status with the given status.
//
// > displayBugSummary() - Display the complete bug details by calling all the required 
//getter methods instead of directly accessing the variables.

package com.methods;

public class Developer_bug {
	int bugId;
	String applicationName;
	String bugtitle;
	String severity;
	String priority;
	String status;
	String assignedDeveloper;

	int getbugId(int bugid) {
		return bugid;
	}

	String getApplicationName(String application) {
		return application;
	}

	String getBugTitle(String title) {
		return title;
	}

	String getseverity(String severity) {
		return severity;
	}

	String getPriority(String poriority) {
		return poriority;
	}

	String getStatus(String status) {
		return status;
	}

	String getAssignedDeveloper(String develperName) {
		return develperName;
	}

	void assignToDeveloper(int bugid, String developerName) {
		System.out.println("Bug Id          :" + bugid);
		System.out.println("Developer       :" + developerName);
	}

	void updatestatus(String status) {
		System.out.println("Update status   :" + status);
	}

	void display(int a, String b, String c, String e, String f, String g, String h) {
		System.out.println("bug Id           :" + a);
		System.out.println("Application Name :" + b);
		System.out.println("Bug Tittle       :" + c);
		System.out.println("severity         :" + e);
		System.out.println("priority         :" + f);
		System.out.println("status           :" + g);
	}

	public static void main(String[] args) {
		Developer_bug d = new Developer_bug();
		d.bugId = 101;
		d.applicationName = "Hosptal";
		d.bugtitle = "Payment issuse";
		d.severity = "low";
		d.priority = "high";
		d.status = "open";
		d.assignedDeveloper = "sai";

		int a = d.getbugId(d.bugId);
		String b = d.getApplicationName(d.applicationName);
		String c = d.getBugTitle(d.bugtitle);
		String e = d.getseverity(d.severity);
		String f = d.getPriority(d.priority);
		String g = d.getStatus(d.status);
		String h = d.getAssignedDeveloper(d.assignedDeveloper);
		d.display(a, b, c, e, f, g, h);
		d.assignToDeveloper(101, h);
		d.updatestatus("close");
	}

}
