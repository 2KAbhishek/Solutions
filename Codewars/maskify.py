def maskify(cc):

    if len(cc) <= 4:
        return cc

    else:
        count = (len(cc) - 4)
        n = 1
        masked = []
        while n <= count:
            masked += '#'
            n += 1

    return (''.join(masked) + ''.join(list(cc)[-4:]))
