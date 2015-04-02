//https://www.linkedin.com/groups/Hi-friends-can-any-one-961927.S.5922749009105014784?view=&item=5922749009105014784&type=member&gid=961927&trk=eml-b2_anet_digest-hero-4-hero-disc-disc-0&midToken=AQH3Bq2jBPZ8KA&fromEmail=fromEmail&ut=2w6Wq4_to38Ss1
	
public class HandlingAuthenticationPopUps 
{/*
	If this is specific to some intranet website that need your system authentication, below are the solutions according to browser: 

		INTERNET EXPLORER: 
		- Make sure or add your website in your trusted sites under 
		"Tools --> Internet Options -->Security --> Trusted Sites" 
		- When done with above, click "Custom Level" button and allow "User Authentication --> Logon --> Automatic logon with current username and password". 

		CHROME: 
		- You just need to modify your url to the format: 
		"https://<userName>:<passWord>@<yourUrl>.com 

		FIREFOX: 
		- You need autoIt here 
		Create a file "FirefoxCredentials.exe" from autoIt using the below autoIt script: 

		#include <Constants.au3> 
		WinWaitActive("Authentication Required") 
		Send($CmdLine[1]) 
		Send("{TAB}") 
		Send($CmdLine[2]) 
		Send("{ENTER}") 

		- Use the created exe file by giving parameter from command prompt(or do coding to use it in code) like below: 
		FirefoxCredentials.exe <userName> <password>

*/}
