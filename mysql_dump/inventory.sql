-- phpMyAdmin SQL Dump
-- version 4.5.3.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 30, 2016 at 07:22 AM
-- Server version: 10.1.9-MariaDB
-- PHP Version: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `inventory`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `id` int(10) UNSIGNED NOT NULL,
  `kode` varchar(256) COLLATE utf8_unicode_ci NOT NULL,
  `nama` varchar(256) COLLATE utf8_unicode_ci NOT NULL,
  `deskripsi` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `id` int(10) UNSIGNED NOT NULL,
  `id_barang` int(10) UNSIGNED NOT NULL,
  `id_pengguna` int(10) UNSIGNED NOT NULL,
  `mulai` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `selesai` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `keterangan` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `lokasi`
--

CREATE TABLE `lokasi` (
  `id` int(10) UNSIGNED NOT NULL,
  `nama` varchar(256) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `migrations`
--

CREATE TABLE `migrations` (
  `migration` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `batch` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `migrations`
--

INSERT INTO `migrations` (`migration`, `batch`) VALUES
('2016_01_24_063353_create_peminjam_table', 1),
('2016_01_24_063500_create_barang_table', 1),
('2016_01_24_063513_create_booking_table', 1),
('2016_01_24_063526_create_lokasi_table', 1),
('2016_01_24_063553_create_pemeliharaan_table', 1),
('2016_01_24_063606_create_penyimpanan_table', 1),
('2016_01_24_063621_create_transaksi_table', 1);

-- --------------------------------------------------------

--
-- Table structure for table `pemeliharaan`
--

CREATE TABLE `pemeliharaan` (
  `id` int(10) UNSIGNED NOT NULL,
  `id_barang` int(10) UNSIGNED NOT NULL,
  `mulai` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `selesai` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `status` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `peminjam`
--

CREATE TABLE `peminjam` (
  `id` int(10) UNSIGNED NOT NULL,
  `nim/nip` varchar(256) COLLATE utf8_unicode_ci NOT NULL,
  `nama` varchar(256) COLLATE utf8_unicode_ci NOT NULL,
  `telepon` varchar(256) COLLATE utf8_unicode_ci NOT NULL,
  `pekerjaan` varchar(256) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `penyimpanan`
--

CREATE TABLE `penyimpanan` (
  `id` int(10) UNSIGNED NOT NULL,
  `id_barang` int(10) UNSIGNED NOT NULL,
  `id_lokasi` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id` int(10) UNSIGNED NOT NULL,
  `id_barang` int(10) UNSIGNED NOT NULL,
  `id_pengguna` int(10) UNSIGNED NOT NULL,
  `dipinjam` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `dikembalikan` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `keterangan` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`id`),
  ADD KEY `booking_id_barang_foreign` (`id_barang`),
  ADD KEY `booking_id_pengguna_foreign` (`id_pengguna`);

--
-- Indexes for table `lokasi`
--
ALTER TABLE `lokasi`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pemeliharaan`
--
ALTER TABLE `pemeliharaan`
  ADD PRIMARY KEY (`id`),
  ADD KEY `pemeliharaan_id_barang_foreign` (`id_barang`);

--
-- Indexes for table `peminjam`
--
ALTER TABLE `peminjam`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `penyimpanan`
--
ALTER TABLE `penyimpanan`
  ADD PRIMARY KEY (`id`),
  ADD KEY `penyimpanan_id_barang_foreign` (`id_barang`),
  ADD KEY `penyimpanan_id_lokasi_foreign` (`id_lokasi`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id`),
  ADD KEY `transaksi_id_barang_foreign` (`id_barang`),
  ADD KEY `transaksi_id_pengguna_foreign` (`id_pengguna`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `barang`
--
ALTER TABLE `barang`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `booking`
--
ALTER TABLE `booking`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `lokasi`
--
ALTER TABLE `lokasi`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `pemeliharaan`
--
ALTER TABLE `pemeliharaan`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `peminjam`
--
ALTER TABLE `peminjam`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `penyimpanan`
--
ALTER TABLE `penyimpanan`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `booking`
--
ALTER TABLE `booking`
  ADD CONSTRAINT `booking_id_barang_foreign` FOREIGN KEY (`id_barang`) REFERENCES `barang` (`id`),
  ADD CONSTRAINT `booking_id_pengguna_foreign` FOREIGN KEY (`id_pengguna`) REFERENCES `peminjam` (`id`);

--
-- Constraints for table `pemeliharaan`
--
ALTER TABLE `pemeliharaan`
  ADD CONSTRAINT `pemeliharaan_id_barang_foreign` FOREIGN KEY (`id_barang`) REFERENCES `barang` (`id`);

--
-- Constraints for table `penyimpanan`
--
ALTER TABLE `penyimpanan`
  ADD CONSTRAINT `penyimpanan_id_barang_foreign` FOREIGN KEY (`id_barang`) REFERENCES `barang` (`id`),
  ADD CONSTRAINT `penyimpanan_id_lokasi_foreign` FOREIGN KEY (`id_lokasi`) REFERENCES `lokasi` (`id`);

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_id_barang_foreign` FOREIGN KEY (`id_barang`) REFERENCES `barang` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `transaksi_id_pengguna_foreign` FOREIGN KEY (`id_pengguna`) REFERENCES `peminjam` (`id`) ON DELETE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
