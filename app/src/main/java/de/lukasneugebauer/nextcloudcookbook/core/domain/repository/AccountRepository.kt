package de.lukasneugebauer.nextcloudcookbook.core.domain.repository

import de.lukasneugebauer.nextcloudcookbook.core.domain.model.Capabilities
import de.lukasneugebauer.nextcloudcookbook.core.domain.model.NcAccount
import de.lukasneugebauer.nextcloudcookbook.core.util.Resource
import kotlinx.coroutines.flow.Flow

interface AccountRepository {

    suspend fun getCapabilities(): Resource<Capabilities>

    fun getAccount(): Flow<Resource<NcAccount>>
}
