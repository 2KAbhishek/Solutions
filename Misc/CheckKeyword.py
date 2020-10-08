# Solution for TCS-NQT 2020 exams code section, written on 03/08/19
# The problem was to check whether a given input is keyword or not in a certain programming language

import keyword as kw
word = input()
if word in kw.kwlist:
	print(word + " is a keyword")
else:
	print(word + " is not a keyword")
