# Code used to intialise and push my git repos to GitHub


## The following code is used to get into the relevant directory
Last login: Wed Apr 13 14:25:49 on ttys000
➜  ~ BNTA\ Workspace 
➜  BNTA Workspace ls
Test    week_01
➜  BNTA Workspace week_01 
➜  week_01 ls
day_02
➜  week_01 day_02
➜  day_02 ls
intro_to_git        terminal_commands   terminal_commands_1
➜  day_02 terminal_commands_1 
➜  terminal_commands_1 ls
terminal_cheatsheet.md

## Here, I initialise the git repo
➜  terminal_commands_1 git init
Initialized empty Git repository in /Users/lewis/BNTA Workspace/week_01/day_02/terminal_commands_1/.git/

## git add . adds all the files in the directory (just the cheatsheet here)
➜  terminal_commands_1 git:(main) ✗ git add .

## The files that have been added to the repo are then committed
➜  terminal_commands_1 git:(main) ✗ git commit -m "Added cheatsheet that covers the general terminal commands"
[main (root-commit) ba919e2] Added cheatsheet that covers the general terminal commands
 1 file changed, 53 insertions(+)
 create mode 100644 terminal_cheatsheet.md

## the remote add origin links the git repo to the created GitHub repo
➜  terminal_commands_1 git:(main) git remote add origin git@github.com:LMBroadhurst/terminalCommandCheatsheet.git

## push now uploads the code to the GitHub repo
➜  terminal_commands_1 git:(main) git push origin main
Enumerating objects: 3, done.
Counting objects: 100% (3/3), done.
Delta compression using up to 8 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 1.17 KiB | 1.17 MiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
To github.com:LMBroadhurst/terminalCommandCheatsheet.git
 * [new branch]      main -> main
➜  terminal_commands_1 git:(main) 