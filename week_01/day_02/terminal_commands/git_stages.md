# The order of how we can create a git repo and then link it to github

## 1. Create a directory in a relevant location.
Using mkdir, we can create a directory for which we can store our repo. For example...

mkdir new_git_repo

## 2. Initialise the git repo
Here we can simply type "git init" to generate the git repo within our current directory.
We can tell that this has worked if our previous command line is followed by "git:(main)".

## 3. Add/Copy/Move files into the new git repo
We can use commands such as...
touch new_file.md
mv cool_picture.png ___new_git_repo___
cp terrible_spreadsheet.csv ___new_git_repo___
All of these will either create, move, or copy files into our repo.

Note that we should now have a small yellow cross following our "git:(main)". This signifies there are changes in the git repo that have not been committed to the repo.

This is a great time to introduce other "less significant" commands.

### git status
Really useful to gain more information on your repo. Will things such as whether there have been changes made, files are ready to be committed (next steps), everything is great, etc.

### git log
This will tell us the commits that have been made to the repo, with details of who made the commits, when they made them, and any notes the committer made.

## 4. "Stage" files, ready to be committed
Now we have files in our folder, we can ready them for the following commit. Using the command "git add .", we can stage all the files within the folder, ready to be committed.
Alternatively, we can use "git add specific_file.txt" to stage the specified file.
Here may be a good time to use "git status", to view information git can currently give us. If you checked "git status" before, notice how it has changed now.

## 5. COMMIT OUR FILES!
We are finally ready to commit our files. The command is as follows...
"git commit -m "Enter message here to explain your commit"
This will commit all the files we staged using "git add ___".
Notice how the yellow x is now gone, we have successfully committed our files to the git repo!

Here we can use our two useful commands, "git log" and "git status".
"git log" will show us the details of our recent commit.
"git status" will show us that there is nothing to commit (as we just committed), and the working tree is clean :)

## 6. Link to GitHub
To do this, we need to create a GitHub account and a GitHub repo for us to link too. Once this is completed, we can use the command:
"git remote add origin ___enter_ssh_related_GitHub_link_here___"
We have now linked our git and GitHib repos.

## 7. Push to GitHub
Finally, we can push our files to GitHub. This can be completed by using the following command:
"git push main origin"
If we go to our GitHub repo and refresh the page, we should now see the git repo files added to the GitHub repo!



### Thanks for reading, hopefully it helped :) 
#### Lewis Broadhurst