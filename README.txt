===== Getting Started =====

System user name: vagrant
System password: vagrant

1. After VM has been provisioned, you will see the Eclipse IDE with the Project 'GraPaccDemo' in the explorer to the left.

2. IMPORTANT: If you do not see code in the editor, click on File -> Refresh. This will refresh the view to show the sample code. Please do not miss this step. If code is already visible, skip this step.

3. In the bottom pane, ensure that there is a CodeCompletionControl view. If not, perform the following steps. If the view is present, skip this step.
	a. Go to Window -> Show View -> Other
	b. Under Code completion, select CodeCompletionControl
	c. Click OK
	d. Press F5 to open database or to the right of the view, click the icon that looks like a disk.
	e. Navigate to /home/vagrant/Downloads
	f. Select the @Patterns_7_JAVAUTIL_110404 directory and click OK.

4. There is some sample code already in the eclipse editor. Place the cursor anywhere AFTER the ArrayList declaration and BEFORE the closing brace of the testDemo() method inside the testDemo() method. If you want to add more code, make sure you add classes which are present in java.util library.

5. Hit 'Ctrl+Space'.

6. You will see a list of patterns such as 

	001.PXXXXX:
	002.PXXXXX:
	003.PXXXXX:

and so on. 

7. Use the arrow keys to navigate, and hit 'Tab' on the one you want to insert. Once the pattern is selected, you will see a preview of a code snippet beside it. 

8. Hit 'Enter' to insert that code snippet in the editor.

9. After inserting, save the file to generate patterns for other sections of the code.

10. This tool works almost as mentioned in the paper. Almost works, in the sense that if there are 20 patterns generated, maybe 2 or 3 of them might not get inserted after selecting them. They will still, however, be offered as a pattern, which the user can read and type as per his convenience. 

11. Sometimes, the tool might generate some intermediate files in either the home folder or the desktop. Do not worry about these files. The files are:
	ppa_new.log
	OutFeatures\
	OutFeatures\0DotGraph\

===== Other information =====

The desktop has the following files
1. ToolDemo-YouTube: Link to executable for starting firefox and opening the YouTube link for the tool demo screencast. Double click and select "Run" when prompted.
2. README.txt: This file
3. Eclipse IDE: Link to eclipse executable.
4. Installation.txt: Steps to install the GraPacc tool.
5. Licenses.txt: Contains the Oracle Binary Code License and the GNU General Public License.

