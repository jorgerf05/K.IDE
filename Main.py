import os

os.system("java -jar /usr/local/lib/jasmin.jar Principal.j")
os.system("java principal > out.txt")
os.system("kitty nvim out.txt")
