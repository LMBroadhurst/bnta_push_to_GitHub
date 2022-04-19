# General terminal commands
-----

## pwd
Entering pwd on our terminal will tell us what directory we are currently located in.
! Use when lost in a directory to double check you are in the right place.

## ls
ls gives us a list of what files and directories are in our current directories.
! Useful to double check whether we have correctly created files/directories, file names, etc.

## -a al -al flags
Using a flag at the end of an ls command gives us ALL the files within a directory (some are hidden) with -a. -l gives us more information on the files, think "longhand" "long" etc.
! Use with ls. Especially useful when locating hidden files or wanting more information about a file within the command terminal.

## cd _______
cd is a command that represents "change directory". We should then follow this up with a directory name to move into that directory.
### cd 
If we do not specify a file name after cd, we go back to the root directory.
! This is a great way to re-orient yourself if you get lost in a directory.
### cd ..
The .. moves you up from the current directory, to the parent directory.

## clear
Clear clears the terminal by pushing all the previous code off the page, the code is not lost.
! Especially useful if you have recently e.g. committed some files and there's loads of confirmatory code below.

## mkdir ______
Make Directory; enter a name after the mkdir command to create a directory name.
! Use camel case or pascal case to name items.

## touch _____
Touch will allow you to create a new file. 
! Name files appropiately, short and concise.

## mv ___file_name___ ___file_directory___
mv will move a specified file into a specified directory.
### mv ___file_name___ __new_file_name__
If we do not specify a relevant/existing file directory, we will rename the file into the new file name.

## cp __file_name__ __file directory__
cp copies a file, to the specified file directory.
### cp __file_name__ .
Using a dot means copy to the current file directory.

## rm __file_name__
rm removes a file completely, not to "trash".
## rm -f
xxx
! We can use a ~ to start from the root directory

## code __file_name__
Code is a command related to VSCode. It will open the specified file name in VSCode.


# Git specific commands
-----

## git init
This will initialise the current directory into a git repo.
! Be wary if the folder within the folder is also a git repo.

## git add .
add . will add all the current files in the directory to the git repo.
### git add __my_file__
When you specify the file, only that file will be added to the repo.

## git status 
Updates you on the status on the repo, maybe there are uncommitted files or files in the directory that haven't been added to the repo.

## git log
Tells you what commits have been made, with timestamps, who made the commits, etc.
! q to exit

## git commit -m "____"
Will commit the files to the git repo.

## git remote add origin _____
Where ___ = SSH link from the GitHub page.
! This links the git repo to the relevant GitHub page.

## git push origin main
This pushes the git repo to the GitHub repo.

## git clone __GitHub_Repo_link__
This clones the current files stored on the GitHub repo to your machine.

## git pull
Pulls the most up to date versions of the files in the relevant GitHub repo to your machine.