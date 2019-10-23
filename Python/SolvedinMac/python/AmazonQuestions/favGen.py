def get_fav(u_map, g_map):

    output = {u_val: [] for u_val in u_map}

    if not g_map:
        return output

    song_genre = {}
    for genre in g_map:
        curr_songs = g_map[genre]
        for c in curr_songs:
            song_genre[c] = genre

    for u in u_map:
        fav_g = {}
        max_value = float('-inf')
        for s in u_map[u]:
            g = song_genre[s]
            if g in fav_g:
                fav_g[g] += 1
            else:
                fav_g[g] = 1
            if fav_g[g] > max_value:
                max_value = fav_g[g]

        for vals in fav_g:
            if fav_g[vals] == max_value:
                output[u].append(vals)

    return output