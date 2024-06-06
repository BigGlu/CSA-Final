def golf_score(par, score, words):
    output = ""
    if par-1 == score:
        if words:
            output = "birdie"
        else:
            output = "1 below par"
    elif par-2 == score:
        if words:
            output = "eagle"
        else:
            output = "2 below par"
    elif par+1 == score:
        if words:
            output = "bogey"
        else:
            output = "1 above par"
    elif par+2 == score:
        if words:
            output = "double bogey"
        else:
            output = "2 above par"
    elif par == score:
        output = "par"
    else:
        output = "error"
    return output

if __name__ == "__main__":
    print(golf_score(5,4,True))  # birdie
    print(golf_score(3,5,True))  # double bogey
    print(golf_score(4,5,True))  # bogey
    print(golf_score(3,2,True))  # birdie
    print(golf_score(7,2,True))  # error     
    print(golf_score(5,4,False)) # 1 below par
