import requests as r
import random

wordneeded = True
choice = None

def getwords():
	words = r.get('https://raw.githubusercontent.com/first20hours/google-10000-english/master/20k.txt') #TODO Change URL to simpler words
	wordlist = words.text
	return random.choice(wordlist.split('\n'))

while wordneeded:
	choice = getwords()
	if len(choice) < 5:
		pass
	elif len(choice) > 12:
		pass
	else:
		wordneeded = False


Stages = {
	1: "   ____     \n  |    |    \n  |         \n  |         \n  |         \n  |         \n _|_        \n|   |______ \n|          |\n|__________|",
	2: "   ____     \n  |    |    \n  |    o    \n  |         \n  |         \n  |         \n _|_        \n|   |______ \n|          |\n|__________|",
	3: "   ____     \n  |    |    \n  |    o    \n  |   /     \n  |         \n  |         \n _|_        \n|   |______ \n|          |\n|__________|",
	4: "   ____     \n  |    |    \n  |    o    \n  |   /|    \n  |         \n  |         \n _|_        \n|   |______ \n|          |\n|__________|",
	5: "   ____     \n  |    |    \n  |    o    \n  |   /|\   \n  |         \n  |         \n _|_        \n|   |______ \n|          |\n|__________|",
	6: "   ____     \n  |    |    \n  |    o    \n  |   /|\   \n  |    |    \n  |         \n _|_        \n|   |______ \n|          |\n|__________|",
	7: "   ____     \n  |    |    \n  |    o    \n  |   /|\   \n  |    |    \n  |   /     \n _|_        \n|   |______ \n|          |\n|__________|",
	8: "   ____     \n  |    |    \n  |    o    \n  |   /|\   \n  |    |    \n  |   / \   \n _|_        \n   |______ \n|          |\n|__________|"
}

print(choice)
