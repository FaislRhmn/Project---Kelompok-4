-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 20 Jun 2021 pada 12.04
-- Versi server: 10.4.19-MariaDB
-- Versi PHP: 8.0.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_aplikasi_penjualan_buku`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_barang`
--

CREATE TABLE `tb_barang` (
  `jumlah` int(100) NOT NULL,
  `kategori` varchar(100) CHARACTER SET latin1 NOT NULL,
  `keterangan` varchar(100) CHARACTER SET latin1 NOT NULL,
  `kode_part` varchar(100) CHARACTER SET latin1 NOT NULL,
  `nama_part` varchar(100) CHARACTER SET latin1 NOT NULL,
  `tanggal` varchar(100) CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_beli`
--

CREATE TABLE `tb_beli` (
  `tanggal` varchar(100) NOT NULL,
  `judul_buku` varchar(250) NOT NULL,
  `kode_buku` varchar(250) NOT NULL,
  `harga_satuan` int(200) NOT NULL,
  `jumlah_beli` int(250) NOT NULL,
  `harga_total` int(200) NOT NULL,
  `bayar` int(200) NOT NULL,
  `kembalian` int(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_beli`
--

INSERT INTO `tb_beli` (`tanggal`, `judul_buku`, `kode_buku`, `harga_satuan`, `jumlah_beli`, `harga_total`, `bayar`, `kembalian`) VALUES
('2021-06-20', 'Marlina Pembunuh dalam Empat Babak', 'ISBN-2020-5555', 36000, 2, 72000, 90000, 18000),
('2021-06-20', 'Marlina Pembunuh dalam Empat Babak', 'ISBN-2020-5555', 36000, 2, 72000, 80000, 8000),
('2021-06-20', 'Marlina Pembunuh dalam Empat Babak', 'ISBN-2020-5555', 36000, 2, 72000, 80000, 8000),
('2021-06-20', 'Marlina Pembunuh dalam Empat Babak', 'ISBN-2020-5555', 36000, 2, 72000, 80000, 8000),
('2021-06-20', 'Marlina Pembunuh dalam Empat Babak', 'ISBN-2020-5555', 36000, 2, 72000, 80000, 8000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_kategori`
--

CREATE TABLE `tb_kategori` (
  `tanggal` varchar(20) CHARACTER SET latin1 NOT NULL,
  `judul_buku` varchar(100) CHARACTER SET latin1 NOT NULL,
  `kode_buku` varchar(50) CHARACTER SET latin1 NOT NULL,
  `kategori_buku` varchar(100) CHARACTER SET latin1 NOT NULL,
  `tahun_terbit` varchar(20) CHARACTER SET latin1 NOT NULL,
  `jumlah_buku` int(200) NOT NULL,
  `harga_buku` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_kategori`
--

INSERT INTO `tb_kategori` (`tanggal`, `judul_buku`, `kode_buku`, `kategori_buku`, `tahun_terbit`, `jumlah_buku`, `harga_buku`) VALUES
('19-06-2021', 'Makan Padang', 'ISBN-0876-0987', 'Novel', '2015', 2, 35000),
('18-06-2021', 'Cinta Ku Padamu', 'ISBN-12345-000', 'Novel', '2013', 2, 32000),
('18-06-2021', 'Marlina Pembunuh dalam Empat Babak', 'ISBN-2020-5555', 'Novel', '2016', 5, 36000),
('18-06-2021', 'Jika Kamu', 'ISBN-9090-4545', 'Cerpen', '2019', 4, 28000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_login`
--

CREATE TABLE `tb_login` (
  `id` int(20) NOT NULL,
  `username` varchar(20) CHARACTER SET latin1 NOT NULL,
  `password` varchar(20) CHARACTER SET latin1 NOT NULL,
  `level` varchar(20) CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_login`
--

INSERT INTO `tb_login` (`id`, `username`, `password`, `level`) VALUES
(1, 'kelompok4', 'kelompok4', 'kelompok4');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_tmp_beli`
--

CREATE TABLE `tb_tmp_beli` (
  `judul_buku` varchar(100) NOT NULL,
  `stok_buku` int(20) NOT NULL,
  `kode_buku` varchar(20) NOT NULL,
  `harga_satuan` int(200) NOT NULL,
  `jumlah_beli` int(200) NOT NULL,
  `harga_total` int(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tb_barang`
--
ALTER TABLE `tb_barang`
  ADD PRIMARY KEY (`kode_part`);

--
-- Indeks untuk tabel `tb_kategori`
--
ALTER TABLE `tb_kategori`
  ADD PRIMARY KEY (`kode_buku`);

--
-- Indeks untuk tabel `tb_login`
--
ALTER TABLE `tb_login`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `tb_login`
--
ALTER TABLE `tb_login`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
