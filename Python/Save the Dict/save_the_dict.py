import pickle

def save_dict(dictionary, path):
    with open(path, "wb") as file:
        pickle.dump(dictionary, file)
        
        
def load_dict(path):
    with open(path, "rb") as file:
        return pickle.load(file)
