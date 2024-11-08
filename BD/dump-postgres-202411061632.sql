PGDMP                   
    |            postgres    17.0    17.0 4               0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                           false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                           false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                           false                       1262    5    postgres    DATABASE     {   CREATE DATABASE postgres WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Spanish_Spain.1252';
    DROP DATABASE postgres;
                     postgres    false                       0    0    DATABASE postgres    COMMENT     N   COMMENT ON DATABASE postgres IS 'default administrative connection database';
                        postgres    false    4886                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
                     pg_database_owner    false                       0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                        pg_database_owner    false    4            �            1259    32847    categorias_idcategoria_seq    SEQUENCE     �   CREATE SEQUENCE public.categorias_idcategoria_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 1   DROP SEQUENCE public.categorias_idcategoria_seq;
       public               postgres    false    4            �            1259    16387 
   categorias    TABLE     �   CREATE TABLE public.categorias (
    idcategoria integer DEFAULT nextval('public.categorias_idcategoria_seq'::regclass) NOT NULL,
    descripcion character varying(255) NOT NULL,
    fecharegistro date NOT NULL,
    bactivo boolean NOT NULL
);
    DROP TABLE public.categorias;
       public         heap r       postgres    false    225    4            �            1259    32882    categorias_id_seq    SEQUENCE     z   CREATE SEQUENCE public.categorias_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE public.categorias_id_seq;
       public               postgres    false    4            �            1259    32849    categorias_idproudcto_seq    SEQUENCE     �   CREATE SEQUENCE public.categorias_idproudcto_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 0   DROP SEQUENCE public.categorias_idproudcto_seq;
       public               postgres    false    4            �            1259    32859    clientes_idcliente_seq    SEQUENCE        CREATE SEQUENCE public.clientes_idcliente_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public.clientes_idcliente_seq;
       public               postgres    false    4            �            1259    32789    clientes    TABLE     1  CREATE TABLE public.clientes (
    idcliente integer DEFAULT nextval('public.clientes_idcliente_seq'::regclass) NOT NULL,
    nombre character varying,
    apellidopaterno character varying,
    apellidomaterno character varying,
    fechanacimiento date,
    fecharegistro date,
    domicilio character varying(255),
    fktipocliente integer,
    bactivo boolean,
    apellido_materno character varying(255),
    apellido_paterno character varying(255),
    b_activo boolean,
    fecha_nacimiento date,
    fecha_registro date,
    fk_tipo_cliente integer
);
    DROP TABLE public.clientes;
       public         heap r       postgres    false    229    4            �            1259    32808    detallesventas    TABLE     �   CREATE TABLE public.detallesventas (
    fknumeroventa integer,
    fknumerocliente integer,
    fknumeroproducto integer,
    cantidadproducto integer,
    iddetalle integer DEFAULT nextval('public.categorias_id_seq'::regclass) NOT NULL
);
 "   DROP TABLE public.detallesventas;
       public         heap r       postgres    false    235    4            �            1259    32883    detalleventa_id_seq    SEQUENCE     |   CREATE SEQUENCE public.detalleventa_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public.detalleventa_id_seq;
       public               postgres    false    4            �            1259    32782 	   productos    TABLE       CREATE TABLE public.productos (
    idproudcto integer DEFAULT nextval('public.categorias_idproudcto_seq'::regclass) NOT NULL,
    descripcion character varying,
    precio real,
    existencia integer,
    fecharegistro date,
    fkcategoria integer,
    bactivo boolean
);
    DROP TABLE public.productos;
       public         heap r       postgres    false    226    4            �            1259    32861    tiposclientes_idtipo_seq    SEQUENCE     �   CREATE SEQUENCE public.tiposclientes_idtipo_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 /   DROP SEQUENCE public.tiposclientes_idtipo_seq;
       public               postgres    false    4            �            1259    32796    tiposclientes    TABLE     �   CREATE TABLE public.tiposclientes (
    idtipo integer DEFAULT nextval('public.tiposclientes_idtipo_seq'::regclass) NOT NULL,
    descripcion character varying,
    fecharegistro date,
    bactivo boolean
);
 !   DROP TABLE public.tiposclientes;
       public         heap r       postgres    false    230    4            �            1259    32851    tipousuarios_idtipo_seq    SEQUENCE     �   CREATE SEQUENCE public.tipousuarios_idtipo_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 .   DROP SEQUENCE public.tipousuarios_idtipo_seq;
       public               postgres    false    4            �            1259    32775    tiposusuarios    TABLE     �   CREATE TABLE public.tiposusuarios (
    idtipo integer DEFAULT nextval('public.tipousuarios_idtipo_seq'::regclass) NOT NULL,
    descripcion character varying,
    fecharegistro date,
    bactivo boolean
);
 !   DROP TABLE public.tiposusuarios;
       public         heap r       postgres    false    227    4            �            1259    32857    usuarios_idusuario_seq    SEQUENCE        CREATE SEQUENCE public.usuarios_idusuario_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public.usuarios_idusuario_seq;
       public               postgres    false    4            �            1259    32768    usuarios    TABLE     0  CREATE TABLE public.usuarios (
    idusuario integer DEFAULT nextval('public.usuarios_idusuario_seq'::regclass) NOT NULL,
    nombre character varying,
    apellidopaterno character varying,
    apellidomaterno character varying,
    fecharegistro date,
    fktipousuario integer,
    bactivo boolean
);
    DROP TABLE public.usuarios;
       public         heap r       postgres    false    228    4            �            1259    32884    venta_id_seq    SEQUENCE     u   CREATE SEQUENCE public.venta_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 #   DROP SEQUENCE public.venta_id_seq;
       public               postgres    false    4            �            1259    32803    ventas    TABLE     �   CREATE TABLE public.ventas (
    idventa integer DEFAULT nextval('public.categorias_id_seq'::regclass) NOT NULL,
    fknumerocliente integer,
    total real,
    fechaventa date
);
    DROP TABLE public.ventas;
       public         heap r       postgres    false    235    4            �            1259    32873 	   vw_ventas    VIEW     	  CREATE VIEW public.vw_ventas AS
 SELECT v.idventa,
    v.fknumerocliente,
    v.total,
    v.fechaventa,
    d.fknumeroproducto,
    d.cantidadproducto,
    d.iddetalle
   FROM (public.ventas v
     JOIN public.detallesventas d ON ((v.idventa = d.fknumeroventa)));
    DROP VIEW public.vw_ventas;
       public       v       postgres    false    224    224    223    223    224    223    224    223    4            �            1259    32863    vw_ventas_report    VIEW     7  CREATE VIEW public.vw_ventas_report AS
 SELECT c.idcliente,
    c.nombre,
    c.apellidopaterno,
    c.apellidomaterno,
    c.fechanacimiento,
    c.fecharegistro,
    t.idtipo AS idtipocliente,
    t.descripcion,
    v.idventa,
    v.total,
    v.fechaventa,
    d.fknumeroproducto,
    cat.descripcion AS categoria,
    cat.idcategoria AS id_categoria,
    d.cantidadproducto,
    p.idproudcto
   FROM (((((public.clientes c
     JOIN public.tiposclientes t ON ((c.idcliente = t.idtipo)))
     JOIN public.ventas v ON ((v.fknumerocliente = c.idcliente)))
     JOIN public.detallesventas d ON ((v.idventa = d.fknumeroventa)))
     JOIN public.productos p ON ((p.idproudcto = d.fknumeroproducto)))
     JOIN public.categorias cat ON ((cat.idcategoria = p.fkcategoria)))
  ORDER BY v.fechaventa, v.idventa, cat.idcategoria;
 #   DROP VIEW public.vw_ventas_report;
       public       v       postgres    false    221    220    217    217    223    223    222    222    223    223    224    224    224    221    221    220    221    221    221    4            �            1259    32868    vw_ventasglobales_report    VIEW     ?  CREATE VIEW public.vw_ventasglobales_report AS
 SELECT c.idcliente,
    c.nombre,
    c.apellidopaterno,
    c.apellidomaterno,
    c.fechanacimiento,
    c.fecharegistro,
    t.idtipo AS idtipocliente,
    t.descripcion,
    v.idventa,
    v.total,
    v.fechaventa,
    d.fknumeroproducto,
    cat.descripcion AS categoria,
    cat.idcategoria AS id_categoria,
    d.cantidadproducto,
    p.idproudcto
   FROM (((((public.clientes c
     JOIN public.tiposclientes t ON ((c.idcliente = t.idtipo)))
     JOIN public.ventas v ON ((v.fknumerocliente = c.idcliente)))
     JOIN public.detallesventas d ON ((v.idventa = d.fknumeroventa)))
     JOIN public.productos p ON ((p.idproudcto = d.fknumeroproducto)))
     JOIN public.categorias cat ON ((cat.idcategoria = p.fkcategoria)))
  ORDER BY v.fechaventa, v.idventa, cat.idcategoria;
 +   DROP VIEW public.vw_ventasglobales_report;
       public       v       postgres    false    223    224    224    224    223    223    223    222    222    221    221    221    221    221    221    220    220    217    217    4            �            1259    32877    vw_ventasrealizadas    VIEW     n  CREATE VIEW public.vw_ventasrealizadas AS
 SELECT v.idventa,
    v.fknumerocliente,
    v.total,
    v.fechaventa,
    d.fknumeroproducto,
    p.descripcion,
    d.cantidadproducto,
    d.iddetalle
   FROM ((public.ventas v
     JOIN public.detallesventas d ON ((v.idventa = d.fknumeroventa)))
     JOIN public.productos p ON ((d.fknumeroproducto = p.idproudcto)));
 &   DROP VIEW public.vw_ventasrealizadas;
       public       v       postgres    false    220    224    224    224    224    223    223    223    223    220    4                       0    16387 
   categorias 
   TABLE DATA           V   COPY public.categorias (idcategoria, descripcion, fecharegistro, bactivo) FROM stdin;
    public               postgres    false    217   "F                 0    32789    clientes 
   TABLE DATA           �   COPY public.clientes (idcliente, nombre, apellidopaterno, apellidomaterno, fechanacimiento, fecharegistro, domicilio, fktipocliente, bactivo, apellido_materno, apellido_paterno, b_activo, fecha_nacimiento, fecha_registro, fk_tipo_cliente) FROM stdin;
    public               postgres    false    221   �F                 0    32808    detallesventas 
   TABLE DATA           w   COPY public.detallesventas (fknumeroventa, fknumerocliente, fknumeroproducto, cantidadproducto, iddetalle) FROM stdin;
    public               postgres    false    224   G                 0    32782 	   productos 
   TABLE DATA           u   COPY public.productos (idproudcto, descripcion, precio, existencia, fecharegistro, fkcategoria, bactivo) FROM stdin;
    public               postgres    false    220   �G                 0    32796    tiposclientes 
   TABLE DATA           T   COPY public.tiposclientes (idtipo, descripcion, fecharegistro, bactivo) FROM stdin;
    public               postgres    false    222   H                 0    32775    tiposusuarios 
   TABLE DATA           T   COPY public.tiposusuarios (idtipo, descripcion, fecharegistro, bactivo) FROM stdin;
    public               postgres    false    219   oH                 0    32768    usuarios 
   TABLE DATA           ~   COPY public.usuarios (idusuario, nombre, apellidopaterno, apellidomaterno, fecharegistro, fktipousuario, bactivo) FROM stdin;
    public               postgres    false    218   �H                 0    32803    ventas 
   TABLE DATA           M   COPY public.ventas (idventa, fknumerocliente, total, fechaventa) FROM stdin;
    public               postgres    false    223   $I                  0    0    categorias_id_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('public.categorias_id_seq', 60, true);
          public               postgres    false    235                       0    0    categorias_idcategoria_seq    SEQUENCE SET     H   SELECT pg_catalog.setval('public.categorias_idcategoria_seq', 9, true);
          public               postgres    false    225                       0    0    categorias_idproudcto_seq    SEQUENCE SET     G   SELECT pg_catalog.setval('public.categorias_idproudcto_seq', 7, true);
          public               postgres    false    226                       0    0    clientes_idcliente_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public.clientes_idcliente_seq', 4, true);
          public               postgres    false    229                       0    0    detalleventa_id_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.detalleventa_id_seq', 1, false);
          public               postgres    false    236                       0    0    tiposclientes_idtipo_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('public.tiposclientes_idtipo_seq', 4, true);
          public               postgres    false    230                       0    0    tipousuarios_idtipo_seq    SEQUENCE SET     E   SELECT pg_catalog.setval('public.tipousuarios_idtipo_seq', 3, true);
          public               postgres    false    227                        0    0    usuarios_idusuario_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public.usuarios_idusuario_seq', 7, true);
          public               postgres    false    228            !           0    0    venta_id_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.venta_id_seq', 1, false);
          public               postgres    false    237            d           2606    32795    clientes clientes_pk 
   CONSTRAINT     Y   ALTER TABLE ONLY public.clientes
    ADD CONSTRAINT clientes_pk PRIMARY KEY (idcliente);
 >   ALTER TABLE ONLY public.clientes DROP CONSTRAINT clientes_pk;
       public                 postgres    false    221            j           2606    32840     detallesventas detallesventas_pk 
   CONSTRAINT     e   ALTER TABLE ONLY public.detallesventas
    ADD CONSTRAINT detallesventas_pk PRIMARY KEY (iddetalle);
 J   ALTER TABLE ONLY public.detallesventas DROP CONSTRAINT detallesventas_pk;
       public                 postgres    false    224            b           2606    32788    productos productos_pk 
   CONSTRAINT     \   ALTER TABLE ONLY public.productos
    ADD CONSTRAINT productos_pk PRIMARY KEY (idproudcto);
 @   ALTER TABLE ONLY public.productos DROP CONSTRAINT productos_pk;
       public                 postgres    false    220            f           2606    32802    tiposclientes tiposclientes_pk 
   CONSTRAINT     `   ALTER TABLE ONLY public.tiposclientes
    ADD CONSTRAINT tiposclientes_pk PRIMARY KEY (idtipo);
 H   ALTER TABLE ONLY public.tiposclientes DROP CONSTRAINT tiposclientes_pk;
       public                 postgres    false    222            `           2606    32781    tiposusuarios tiposusuarios_pk 
   CONSTRAINT     `   ALTER TABLE ONLY public.tiposusuarios
    ADD CONSTRAINT tiposusuarios_pk PRIMARY KEY (idtipo);
 H   ALTER TABLE ONLY public.tiposusuarios DROP CONSTRAINT tiposusuarios_pk;
       public                 postgres    false    219            ^           2606    32774    usuarios usuarios_pk 
   CONSTRAINT     Y   ALTER TABLE ONLY public.usuarios
    ADD CONSTRAINT usuarios_pk PRIMARY KEY (idusuario);
 >   ALTER TABLE ONLY public.usuarios DROP CONSTRAINT usuarios_pk;
       public                 postgres    false    218            h           2606    32807    ventas ventas_pk 
   CONSTRAINT     S   ALTER TABLE ONLY public.ventas
    ADD CONSTRAINT ventas_pk PRIMARY KEY (idventa);
 :   ALTER TABLE ONLY public.ventas DROP CONSTRAINT ventas_pk;
       public                 postgres    false    223                ^   x�3��/H�4202�54�50�,�2�tN�)�I,J-FH�r�q�p��&�ޜ����&i��[�������p	�9n�J�,�;����D� +�4&         {   x�3�t-�K-.�W��O��,>�0/9#���8�$�3Ə����D��P���391''U�\!�,U� � �(��4��D�".#|�ZZZ���X�m�1��7�j�	��W((*MMJڒ�Ŗ=... �o�         v   x�Mй1DјS�!���p��^s �%P%�Em1h��HF1&VcCM>�����)����Ā%����f���+�S����ٝ��63��tQO�zz�|H�� \z=�         i   x���A
� @���)��Ҙ^��1������m!���Ԑ�-R<��r��$���u����#��O�Mz��������+m��U��9�O��������j)G|         E   x�3�tJ,�L��4202�54�50�,�2�t,K̫JLA7�(J��,�E6�,(*MMJDM����� laP         7   x�3��/H-J,�,��4202�54�50�,�2�tL����,.)JL�/B������ �A         ^   x�3�t-�K-.�W��O���!##]CC]SNC�.#"��Ƅ5��j�/�K�H�¢������|t��x�*��&%�jI����� �fN?         ^   x�mл�0���Ō>'cz��:<�̦/ўbh����Ԍ��l���?�$�"܄`��,�&�	�P����E����E�/�:�����������V-     