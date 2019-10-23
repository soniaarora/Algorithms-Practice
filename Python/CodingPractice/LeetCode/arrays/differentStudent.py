def differentTeams(skills):
    mapStud = {}
    for c in skills:
        mapStud[c] = mapStud.get(c, 0) + 1

    minCount = float('inf')
    for value in mapStud.values():
        minCount = min(minCount, value)
    

    return minCount if len(mapStud) == 5 else 0





s = "pcmbzpcmbz"
print(differentTeams(s))