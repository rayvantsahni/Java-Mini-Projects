data = []
choice = ''

def line():
    print('---------------------------')

def show_menu():
    line()
    print('MENU')
    line()
    print('1. Add item')
    print('2. Mark as done')
    print('3. View list')
    print('4. Exit')
    line()
    choice = input('Enter your choice: ')
    return choice

while choice != '4':
    choice = show_menu()
    if choice == '1':
        item = input('What do you want to add? ')
        data.append(item)
        print('Item added:', item)
    elif choice == '2':
        item = input('What has been done? ')
        if item in data:
            data.remove(item)
            print('Removed item', item)
        else:
            print('Could not find item', item)
    elif choice == '3':
        print('\nList of to-do items:')
        for item in data:
            print(item)
    elif choice == '4':
        print('OK. Goodbye!')
    else:
        print('Please enter one of 1, 2, 3 or 4')
        
