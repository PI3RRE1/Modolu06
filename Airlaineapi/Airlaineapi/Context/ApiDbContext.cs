using Airlaineapi.Models;
using Microsoft.EntityFrameworkCore;

namespace Airlaineapi.Context
{
    public class ApiDbContext : DbContext
    {
        public ApiDbContext(DbContextOptions<ApiDbContext> options) : base(options) { }

        public DbSet<Usuario> Usuarios { get; set; }

        public DbSet<Reserva> Reservas { get; set; }

        public DbSet<FaleConosco> FaleConoscos { get; set; }
    }
}
