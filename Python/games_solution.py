import random

#Initial amount of money
total_money = 100

#Write your game of chance functions here
def coin_toss(bet_amount, player_call):
  if bet_amount <= 0:
    print("Bet amount should be more than ZERO.")
    return 0

  toss_outcome = random.choice(["Heads", "Tails"])
  print("You guessed", player_call)
  print("Coin showed", toss_outcome)

  if toss_outcome == player_call:
    print("You won!")
    return bet_amount
  else:
    print("You lost :(")
    return -bet_amount

def cho_han(bet_amount, prediction):
    if bet_amount <= 0:
      print("Bet amount should be more than ZERO.")
      return 0

    dice1 = random.randint(1, 6)
    dice2 = random.randint(1, 6)
    print("Sum of the 2 dice is", dice1 + dice2)

    if (dice1 + dice2) % 2 == 0 and prediction == "even":
      print("You won!!")
      return bet_amount
    elif (dice1 + dice2) % 2 == 1 and prediction == "odd":
      print("You won!!")
      return bet_amount
    else:
      print("You lost :(")
      return -bet_amount
    
def pick_a_card(bet_amount):
    if bet_amount <= 0:
      print("Bet amount should be more than ZERO.")
      return 0

    cards = [i + 1 for i in range(10)]
    p1 = random.choice(cards)
    cards.remove(p1)
    p2 = random.randint(1, 10)

    print("Your card was", p1)
    print("Opponent's card was", p2)

    if p1 > p2:
      print("You won!!")
      return bet_amount
    else:
      p1 < p2
      print("You lost :(")
      return -bet_amount
      
'''    
def roulette(bet_amount, guess):
  if bet_amount <= 0:
    print("Bet amount should be more than ZERO.")
    return 0

  #A standard roulette wheel has the numbers 0 through 36 as well as 00. We'll use 37 to represent 00.
  result = random.randint(0, 37)
  if result == 37:
    print("Wheel landed on 00")
  else:
    print("Wheel landed on", result)

  #Checks to see if we guessed Even and the result was even. If the result was 0, the player shouldn't win
  if guess == "Even" and result % 2 == 0 and result != 0:
    print(result, "is an even number.")
    print("You won!!")
    return bet_amount

  #Checks to see if we guessed Odd and the result was odd. If the result was 37, the player shouldn't win, since that's what we are using to represent 00.
  elif guess == "Odd" and result % 2 == 1 and result != 37:
    print(result, "is an odd number.")
    print("You won!!")
    return bet_amount

  # If you guessed a number and the result was that number, you should win 35 times the amount they bet
  elif guess == result:
    print("You guessed", guess, "and the result was", result)
    print("You won!!")
    return bet_amount * 35

  # If none of the above are true, you lost.
  else:
      print("You lost :(")
      return -bet_amount
'''



#Call your game of chance functions here
total_money += coin_toss(10, "Heads")
total_money += cho_han(15, "Even")
total_money += pick_a_card(50)

print("Your total amount of money is", total_money)