# Introduction of Git

Git is a popular version control system(VCS), It was created by Linus Torvalds
in 2005 and has been maintained by Junio Hamano

Git is used for

a. Tracking code changes
b. Tracking who made changes like history of the files
c. Coding Collaborations



# VCS (Version Control System)

It is a system that records changes to a file or set of files over time, so that
we can recall specific versions later, i.e., for every source code changes in a
file a new version will be created.


Types of Version Control System

1. Centralized Version Control System (CVCS)
2. Distributed Version Control System (DVCS)



# Centralized Version Control System

Developers can collaborate and do the changes
Eg: CVS, SubVersion,Perforce


# Distributed Version Control System


DVCS are Git, Mercurial,Darcs, Bazaar,...etc

Developers don't check out the latest snapshot of the files rather they fully mirror
the repository including its full history.

If the main server dies, then the local system will maintain a copy of the main
repository which has full backup of data.

If the remote repository is down, then the developer can make changes in the
local repository and when the main repository is up the code can be pushed to
remote repository from local repository.


# Git Software Installation

There are 2 types of Git softwares
a. Git Server
b. Git Client


# Git Server

It is a repository

It is the largest host of source code in the world
It is used to store/maintain the source code of the project

Some of the git server tools are : Github, Gitlab,BitBucket,Gitblit,....



# How to install Git Client software?

It is an open source software

It is in the form of .exe file

Download git.exe file from https://git-scm.com/download/win

Run the git.exe file then we will get below 3 softwares

- git bash
- git GUI
- git cmd


# Git Architecture

There are 3 stages involved :

1. Working area
2. Stage area
3. Local repository