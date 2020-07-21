import random
import time

def waiting_game():
    
    goal_time = random.choice([2, 2.5, 3, 3.5, 4, 4.5])
    print("Your goal is", goal_time, "seconds.\n")
    
    input("----Press Enter key to begin----\n")
    start = time.perf_counter()
    
    input("...Press Enter key after " + str(goal_time) + " seconds...\n")
    elapsed_time = time.perf_counter() - start
    print("\nTime Elapsed:", round(elapsed_time, 3))
    
    if elapsed_time == goal_time:
        print("Wow! Superb Timing.")
    elif elapsed_time < goal_time:
        print("(Ahh!", round(goal_time - elapsed_time, 3), "seconds too fast.)")
    else:
        print("(Ahh!", round(elapsed_time - goal_time, 3), "seconds too slow.)")
        
        
waiting_game()
