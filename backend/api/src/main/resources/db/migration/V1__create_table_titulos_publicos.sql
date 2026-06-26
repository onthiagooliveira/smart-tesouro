CREATE TABLE titulos_publicos (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    nome_titulo VARCHAR(50) NOT NULL,
    tipo VARCHAR(25) NOT NULL,
    data_vencimento DATE NOT NULL,
    taxa_anual NUMERIC(10, 4) NOT NULL,
    preco_unitario NUMERIC(19, 2) NOT NULL,
    data_registro TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);