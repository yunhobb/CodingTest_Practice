SELECT 
    I.ID,
    N.FISH_NAME,
    I.LENGTH
FROM
    FISH_INFO I
JOIN
    FISH_NAME_INFO N ON I.FISH_TYPE = N.FISH_TYPE
WHERE
    I.ID = (
        SELECT
            I2.ID
        FROM
            FISH_INFO I2
        WHERE
            I2.FISH_TYPE = I.FISH_TYPE
        ORDER BY
            I2.LENGTH DESC
        LIMIT 1
    )
ORDER BY 
    I.ID ASC;