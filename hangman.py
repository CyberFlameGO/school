import requests as r
import random

wordneeded = True
choice = None

def getwords():
    words = r.get('https://raw.githubusercontent.com/first20hours/google-10000-english/master/20k.txt')
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

print(choice)
