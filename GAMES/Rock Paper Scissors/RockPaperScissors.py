import random

#initializing the scores with 0's
p = b = 0

d = dict()
d['R'] = 'ROCK'
d['r'] = 'ROCK'
d['S'] = 'SCISSORS'
d['s'] = 'SCISSORS'
d['P'] = 'PAPER'
d['p'] = 'PAPER'


print('Hello and Welcome to the Game of Rock Paper Scissors!\n')
print('This game has 2 modes:', 'A: POINTS MODE (you play until one of the players achieve a certain number of points)', 'B: ROUNDS MODE (you play a fixed number of rounds and the player with the maximum points at the end wins)', sep = '\n')


print('Please tell us which mode do you want to play in.\n')

mode = input("Enter 'A' for POINTS MODE or 'B' for ROUNDS MODE\n")

if mode == 'A' or mode == 'a':
    
    print('How many points do you want to play for?')
    
    n = input("Press '5' for 5 points\nPress '10' for 10 points\nPress 'C' for a custom input\n")

    if n == '5':
        points = 5

    if n == '10':
        points = 10

    if n == 'C' or n == 'c':
        points = int(input('How many points do you want to play for?'))
        
    while(1):
        bot = random.choice(['R', 'P', 'S'])
        player = input('enter R for rock\nenter P for paper\nenter S for scissor\n')
        
        print('BOT chose', d[str(bot)], 'and YOU chose', d[str(player)], sep = ' ')

        if player == bot:
            print('Tie', 'No point', sep = '\n')
            print('BOT:', b, '  YOU:', p, sep = '', end = '\n')

        if player == 'R' or player == 'r':
            if bot == 'S' or bot == 's':
                print('Point for PLAYER')
                p += 1
                print('BOT:', b, '  YOU:', p, sep = '', end = '\n')
                if p == points:
                    break

            if bot == 'P' or bot == 'p':
                print('Point for BOT')
                b += 1
                print('BOT:', b, '  YOU:', p, sep = '', end = '\n')
                if b == points:
                    break

        if player == 'S' or player == 's':
            if bot == 'P' or bot == 'p':
                print('Point for PLAYER')
                p += 1
                print('BOT:', b, '  YOU:', p, sep = '', end = '\n')
                if p == points:
                    break

            if bot == 'R' or bot == 'r':
                print('Point for BOT')
                b += 1
                print('BOT:', b, '  YOU:', p, sep = '', end = '\n')
                if b == points:
                    break

        if player == 'P' or player == 'p':
            if bot == 'R' or bot == 'r':
                print('Point for PLAYER')
                p += 1
                print('BOT:', b, '  YOU:', p, sep = '', end = '\n')
                if p == points:
                    break

            if bot == 'S' or bot == 's':
                print('Point for BOT')
                b += 1
                print('BOT:', b, '  YOU:', p, sep = '', end = '\n')
                if b == points:
                    break
                    
                    
if mode == 'B' or mode == 'b':
    
    print('How many rounds do you want to play?')
    
    n = input("Press '5' for 5 rounds\nPress '10' for 10 rounds\nPress 'C' for a custom input\n")

    if n == '5':
        rounds = 5

    if n == '10':
        rounds = 10

    if n == 'C' or n == 'c':
        rounds = int(input('How many rounds do you want to play?'))
        
    for i in range(rounds):
    
        print('\n.............ROUND', i+1, '.............', sep = ' ')

        bot = random.choice(['R', 'P', 'S'])
        player = input('enter R for rock\nenter P for paper\nenter S for scissor\n')
        print('BOT chose', bot, 'and YOU chose', player, sep = ' ')

        if player == bot:
            print('Tie', 'No point', sep = '\n')

        if player == 'R' or player == 'r':
            if bot == 'S' or bot == 's':
                print('Point for YOU')
                p += 1

            if bot == 'P' or bot == 'p':
                print('Point for BOT')
                b += 1

        if player == 'S' or player == 's':
            if bot == 'P' or bot == 'p':
                print('Point for YOU')
                p += 1

            if bot == 'R' or bot == 'r':
                print('Point for BOT')
                b += 1

        if player == 'P' or player == 'p':
            if bot == 'R' or bot == 'r':
                print('Point for YOU')
                p += 1

            if bot == 'S' or bot == 's':
                print('Point for BOT')
                b += 1
                
                
print('\nThe Final Scores are -')
print('Bot: ', b ,'\nPlayer: ', p, sep = '')
print('It is a Tie') if  p == b else print('Congratss! You won.' if p > b else 'Alas, You lost. Maybe try again..')
