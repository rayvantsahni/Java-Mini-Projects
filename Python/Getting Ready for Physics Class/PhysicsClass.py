train_mass = 22680
train_acceleration = 10
train_distance = 100
bomb_mass = 1

c = 3 * pow(10, 8)

def f_to_c(f_temp):
  c_temp = (f_temp - 32) * 5 / 9
  return c_temp

f100_in_celcius = f_to_c(100)

def c_to_f(c_temp):
  f_temp = c_temp * (9 / 5) + 32
  return f_temp

c1_in_fahrenheit = c_to_f(0)

def get_force(mass, acceleration):
  return mass * acceleration

train_force = get_force(train_mass, train_acceleration)

print("The GE train supplies", train_force, "Newtons of force.")

def get_energy(mass):
  return mass * c * c

bomb_energy = get_energy(bomb_mass)

print("A 1kg bomb supplies", bomb_energy, "Joules.")

def get_work(mass, acceleration, distance):
  force = get_force(mass, acceleration)
  return force * distance

train_work = get_work(train_mass, train_acceleration, train_distance)

print("The GE train does", train_work, "Joules of work over", train_distance, "meters.")
