SELECT
    
    dis.distrito,
    reg.region,
    vi.nombre,
    vi.n_visitas,
    COUNT(vi.idvisita),
    COUNT(vi.n_visitas)
FROM
    distrito AS dis,
    visita AS vi,
    persona AS per,
    region AS reg,
    rol AS r,
    usuario AS u
WHERE
    dis.iddistrito = per.iddistrito AND per.idpersona = vi.idpersona AND reg.idregion = dis.idregion AND per.idpersona = u.idusuario AND u.idrol = r.idrol AND r.nam_rol = 'pastor' AND reg.region <> '1'
GROUP BY
    dis.iddistrito  
ORDER BY `reg`.`region` ASC