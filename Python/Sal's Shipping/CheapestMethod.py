weight = float(input("how much does you package weigh?"))

def ground_shipping_cost(w):
  if w <= 2:
    return 20 + w*1.5
  elif w<=6 and w>2:
    return 20 + 3*w
  elif w>6 and w<=10:
    return 20 + 4*w
  else:
    return 20 + 4.75*w


premium_ground_shipping = 125

def drone_shipping_cost(w):
  if w <= 2:
    return w*4.5
  elif w<=6 and w>2:
    return w*9
  elif w>6 and w<=10:
    return w*12
  else:
    return w*14.25

def cheapest_option(weight):
  drone = drone_shipping_cost(weight)
  ground = ground_shipping_cost(weight)
  premium = premium_ground_shipping

  if drone < ground and drone < premium:
    print("The cheapest option is the Drone Shipping which will cost", premium)
  elif ground < drone and ground < premium:
    print("The cheapest option is the Ground Shipping which will cost", ground)
  elif premium < drone and premium < ground:
    print("The cheapest option is the Premium Ground Shipping which will cost", premium)
    return "\n"

print(cheapest_option(41.5))

print(cheapest_option(4.8))

