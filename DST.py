import time as t

def calc():
    unknown = input('What do you want to figure out?\n')
    if unknown == 'speed':
        time = int(input('what\'s the time?\n'))
        t.sleep(2)
        distance = int(input('What\'s the distance?\n'))
        print('Calculating....')
        t.sleep(2)
        speed = distance / time
        print(f'Your speed is {speed}m/s')
    if unknown == 'distance':
        time = int(input('what\'s the time?\n'))
        t.sleep(2)
        speed = int(input('What\'s the speed?\n'))
        print('Calculating....')
        t.sleep(2)
        distance = speed * time
        print(f'Your distance is {distance}m')
    if unknown == 'time':
        speed = int(input('what\'s the speed?\n'))
        t.sleep(2)
        distance = int(input('What\'s the distance?\n'))
        print('Calculating....')
        t.sleep(2)
        time = distance / speed
        print(f'Your speed is {speed}m/s')

calc()